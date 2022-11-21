package daily;

public class BinarySearch {
    public int binarySearch(int[] arr, int target) {
        return binarySearch1(target, 0, arr.length-1, arr);
    }

    int binarySearch1(int key, int low, int high, int[] arr) {
        int mid;

        if(low <= high) {
            mid = (low + high) / 2;

            if(key == arr[mid]) { // 탐색 성공
                return mid;
            } else if(key < arr[mid]) {
                // 왼쪽 부분 arr[0]부터 arr[mid-1]에서의 탐색
                return binarySearch1(key ,low, mid-1, arr);
            } else {
                // 오른쪽 부분 - arr[mid+1]부터 arr[high]에서의 탐색
                return binarySearch1(key, mid+1, high, arr);
            }
        }

        return -1; // 탐색 실패
    }
}
