package Custom_Library_java;

import java.util.ArrayList;

class Quick{
    /**
     * The parameter @param arr -> ArrayList input Type must be Integer Type using generic.
     * @return
     * 
     * 파라미터로 주어지는 @param arr -> ArrayList는 제너릭 기법을 사용해서 Integer 타입으로 제공해주세요.
     * @return
     */
    public static ArrayList<Integer> Quick_sort_Integer(ArrayList<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }

        int pivot = arr.get(arr.size() / 2);

        ArrayList<Integer> lesser = new ArrayList<Integer>();
        ArrayList<Integer> equal = new ArrayList<Integer>();
        ArrayList<Integer> better = new ArrayList<Integer>();

        for (int num : arr) {
            if (num < pivot) {
                lesser.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                better.add(num);
            }
        }

        ArrayList<Integer> sortedArr = new ArrayList<Integer>();

        sortedArr.addAll(Quick_sort_Integer(lesser));
        sortedArr.addAll(equal);
        sortedArr.addAll(Quick_sort_Integer(better));

        return sortedArr;
    }

    /**
     * The parameter @param arr -> ArrayList input Type must be Double Type using generic.
     * @return
     * 
     * 파라미터로 주어지는 @param arr -> ArrayList는 제너릭 기법을 사용해서 Double 타입으로 제공해주세요.
     * @return
     */
    public static ArrayList<Double> Quick_sort_Double(ArrayList<Double> arr) {
        if (arr.size() <= 1) {
            return arr;
        }

        Double pivot = arr.get(arr.size() / 2);

        ArrayList<Double> lesser = new ArrayList<Double>();
        ArrayList<Double> equal = new ArrayList<Double>();
        ArrayList<Double> better = new ArrayList<Double>();

        for (Double num : arr) {
            if (num < pivot) {
                lesser.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                better.add(num);
            }
        }

        ArrayList<Double> sortedArr = new ArrayList<Double>();

        sortedArr.addAll(Quick_sort_Double(lesser));
        sortedArr.addAll(equal);
        sortedArr.addAll(Quick_sort_Double(better));

        return sortedArr;
    }
}

