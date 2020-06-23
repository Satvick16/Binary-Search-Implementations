class RecursiveBinarySearch {

    void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 8, 13, 21, 34, 55};
        int toFind = 2;

        System.out.println(search(numbers, 0,
                numbers.length - 1, toFind));
    }

    int search(int[] numbers, int start,
                                  int end, int toFind) {

        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (numbers[mid] == toFind) {
            return mid;
        } else if (numbers[mid] > toFind) {
            return search(numbers, start, mid - 1, toFind);
        } else {
            return search(numbers, mid + 1, end, toFind);
        }

    }

}
