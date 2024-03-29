package H_Index;

import java.util.Arrays;

class Solution {
  static int []cia;
  public static int solution(int[] citations) {
    int answer = 0;
    cia= citations;
    //sort 10,000 이상
    mergeSort(cia,cia.length);
    ///
    for (int i = 0; i < cia.length; i++) {
      /// 총 발표한
      int h = citations.length - i;
      if (citations[i] >= h) {
        answer = h;
        break;
      }
    }
    return answer;
  }

  static void mergeSort(int[] a, int n) {
    if (n < 2) {
      return;
    }
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];

    for (int i = 0; i < mid; i++) {
      l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
      r[i - mid] = a[i];
    }
    mergeSort(l, mid);
    mergeSort(r, n - mid);
    merge(a, l, r, mid, n - mid);
  }
  static void merge(
      int[] a, int[] l, int[] r, int left, int right) {

    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
      if (l[i] <= r[j]) {
        a[k++] = l[i++];
      }
      else {
        a[k++] = r[j++];
      }
    }
    while (i < left) {
      a[k++] = l[i++];
    }
    while (j < right) {
      a[k++] = r[j++];
    }
  }
  public static void main(String[] args) {
    int input[] ={3, 0, 6, 1, 5};
    System.out.println(solution(input));
  }
}
