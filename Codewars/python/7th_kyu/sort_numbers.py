def solution(nums):
    if nums is None:
        return []
    else:
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if nums[i] > nums[j]:
                    (nums[i], nums[j]) = (nums[j], nums[i])
    return nums