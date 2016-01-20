import java.util.Scanner;

/**
 * Author: 王俊超
 * Date: 2016-01-20 09:05
 * CSDN: http://blog.csdn.net/derrantcm
 * Github: https://github.com/Wang-Jun-Chao
 * Declaration: All Rights Reserved !!!
 */
public class CppConverter {
    private final static int MAX_NUM = 30010;
    private final static int[] NUM = new int[MAX_NUM];
    private final static SegmentTreeNode[] TREE_NODE = new SegmentTreeNode[3 * MAX_NUM];


    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static class SegmentTreeNode {
        private int left;
        private int right;
        private int num;

        public int mid() {
            return (left + right) / 2;
        }
    }

    private static int build(int left, int right, int idx) {
        SegmentTreeNode node = new SegmentTreeNode();
        node.left = left;
        node.right = right;
        node.num = -1;

        TREE_NODE[idx] = node;

        if (left == right) {
            return TREE_NODE[idx].num = NUM[left];
        }

        int mid = (left + right) / 2;
        return TREE_NODE[idx].num = max(
                build(left, mid, idx << 1),
                build(mid + 1, right, (idx << 1) + 1));
    }


    public static void update(int id, int x, int idx) {
        if (TREE_NODE[idx].left == TREE_NODE[idx].right) {
            TREE_NODE[idx].num = x;
            return;
        }

        int mid = (TREE_NODE[idx].left + TREE_NODE[idx].right) / 2;

        if (id <= mid) {
            update(id, x, idx << 1);
        } else {
            update(id, x, (idx << 1) + 1);
        }

        TREE_NODE[idx].num = max(TREE_NODE[idx << 1].num, TREE_NODE[(idx << 1) + 1].num);
    }

    public static int query(int left, int right, int idx) {
        if (left == TREE_NODE[idx].left && right == TREE_NODE[idx].right) {
            return TREE_NODE[idx].num;
        }

        int mid = (TREE_NODE[idx].left + TREE_NODE[idx].right) / 2;
        if (right <= mid) {
            return query(left, right, idx << 1);
        } else if (left > mid) {
            return query(left, right, idx << 1 | 1);
        } else {
            return max(query(left, mid, idx << 1), query(mid + 1, right, idx << 1 | 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Scanner scanner = new Scanner(Main.class.getClassLoader().getResourceAsStream("data.txt"));


        // 人数
        int num = scanner.nextInt();
        // 操作数目
        int row = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            NUM[i] = scanner.nextInt();
        }

        build(1, num, 1);


        for (int i = 0; i < row; i++) {
            char opt = scanner.next().charAt(0);
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x < num) {
                x += 1;
            }

            if (y < num) {
                y += 1;
            }

            switch (opt) {
                case 'Q':
                    System.out.println(query(x, y, 1));
                    break;
                case 'U':
                    update(x, y, 1);
                    break;
            }
        }

        scanner.close();
    }
}
