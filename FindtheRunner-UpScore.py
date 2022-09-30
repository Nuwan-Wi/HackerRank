# create: 2022 09 27
# Owner: Nuwan Wijeweera

# Given the participants' score sheet for your University Sports Day, you are required to find the runner-up score. You are given n scores. Store them in a list and find the score of the runner-up.

# Input Format
# The first line contains n. The second line contains an array A[] of n integers each separated by a space.

# Constraints
#2 <= n <= 10
#-100 <= A[i] <= 100

# Output Format
# Print the runner-up score.

# Sample Input 0
# 5
# 2 3 6 6 5

# Sample Output 0
# 5

# Explanation 0
# Given list is . The maximum score is , second maximum is . Hence, we print  as the runner-up score.

if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    listNum =list(set(arr))
    maxValur = max(listNum)
    try:
        while True:
            listNum.remove(maxValur)
    except:
        print(max(listNum))
