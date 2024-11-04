def pipe_fix(nums):
    l = []
    left = nums[0]
    while left <= nums[len(nums) - 1]:
        l.append(left)
        left += 1
    return l