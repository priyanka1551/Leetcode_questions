class Solution {
  public int[] set_intersection(HashSet<Integer> s1, HashSet<Integer> s2) {
    int [] output = new int[s1.size()];
    int idx = 0;
    for (Integer s : s1)
      if (s2.contains(s)){
         output[idx] = s; 
          idx++;
      } 

    return Arrays.copyOf(output,idx);
  }

  public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set1 = new HashSet<Integer>();
    for (Integer n : nums1) set1.add(n);
    HashSet<Integer> set2 = new HashSet<Integer>();
    for (Integer n : nums2) set2.add(n);

    if (set1.size() < set2.size()) return set_intersection(set1, set2);
    else return set_intersection(set2, set1);
  }
}