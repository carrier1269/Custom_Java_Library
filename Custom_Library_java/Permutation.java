package Skills;

import java.util.ArrayList;
import java.util.List;

// ArrayList<Integer> per_stradd_arr = new ArrayList<Integer>();

// List<List<Integer>> permutations = Permutation.generatePermutations(numbers, numbers.size());

//for (List<Integer> permutation : permutations){
//
//
//        for(int num:permutation){
//
//        }
//}

// 순열
class Permutation {
    public static List<List<Integer>> generatePermutations(List<Integer> arr, int num) {
        List<List<Integer>> permutations = new ArrayList<>();
        backtrack(arr, num, new ArrayList<>(), permutations);
        return permutations;
    }

    private static void backtrack(List<Integer> arr, int num, List<Integer> tempList, List<List<Integer>> permutations) {
        if (tempList.size() == num) {
            permutations.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < arr.size(); i++) {
                if (tempList.contains(arr.get(i))) {
                    continue;
                }
                tempList.add(arr.get(i));
                backtrack(arr, num, tempList, permutations);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
