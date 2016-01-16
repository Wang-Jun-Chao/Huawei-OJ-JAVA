package huawei;

import java.io.*;
import java.util.*;

import static huawei.SortFile.SortType.WORDASC;

public class SortFile {

    public enum SortType {
        WORDASC,
        WORDDSC,
        WORDCOUNT;
    }

    public boolean sortWords(String srcPathName, String dstPathName, SortType type) {

        if (srcPathName== null || dstPathName == null || type == null) {
            return false;
        }

        BufferedReader reader = null;
        BufferedWriter writer = null;
        boolean rs = true;
        Map<String, Integer> map = new HashMap<String, Integer>(256);
        try {
            reader = new BufferedReader(new FileReader(srcPathName));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("(\\s+)|(\\.)|(,)|(:)|(;)|(\\?)|(!)|(\")");
                for (String s : words) {

                    if (s.length() > 0) {
                        if (map.containsKey(s)) {
                            map.put(s, map.get(s) + 1);
                        } else {
                            map.put(s, 1);
                        }
                    }
                }
            }

            Object[][] objs = new Object[map.size()][2];

            int i = 0;
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                objs[i] = new Object[]{e.getKey(), e.getValue()};
                i++;
            }

            switch (type) {
                case WORDASC:
                    Arrays.sort(objs, new Comparator<Object[]>() {
                        @Override
                        public int compare(Object[] o1, Object[] o2) {
                            String s1 = (String) o1[0];
                            String s2 = (String) o2[0];
                            return s1.compareTo(s2);
                        }
                    });
                    break;
                case WORDDSC:
                    Arrays.sort(objs, new Comparator<Object[]>() {
                        @Override
                        public int compare(Object[] o1, Object[] o2) {
                            String s1 = (String) o1[0];
                            String s2 = (String) o2[0];
                            return -s1.compareTo(s2);
                        }
                    });
                    break;
                case WORDCOUNT:
                    Arrays.sort(objs, new Comparator<Object[]>() {
                        @Override
                        public int compare(Object[] o1, Object[] o2) {
                            Integer i1 = (Integer) o1[1];
                            Integer i2 = (Integer) o2[1];
                            return i2 - i1;
                        }
                    });
                    break;
                default:
                    break;
            }

            writer = new BufferedWriter(new FileWriter(new File(dstPathName)));

            for (Object[] o : objs) {
                writer.write(o[0] + ":" + o[1] + "\n");
            }

            writer.flush();

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    rs = false;
                }
            }

            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    rs = false;
                }
            }
        }

        return rs;
    }


}
