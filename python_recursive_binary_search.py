def search(numbers: list, start: int, end: int, toFind: int) -> int:
    if start > end:
        return -1

    mid = start + (end - start) // 2

    if numbers[mid] == toFind:
        return mid
    elif numbers[mid] > toFind:
        return search(numbers, start, mid - 1, toFind)
    else:
        return search(numbers, mid + 1, end, toFind)


def main():
    numbers = [1, 2, 3, 5, 8, 13, 21, 34, 55]
    toFind = 2
    print(search(numbers, 0, len(numbers) - 1, toFind))
