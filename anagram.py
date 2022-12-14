# a program that groups string arrays into an anagram
# define a function that will sort and group string array into an anagram
def group_anagrams(strs):

    # create empty list to append anagram into
    result = {}
    # loop over all instances of string array, sort, join and then append into designated list
    for i in strs:
        x = "".join(sorted(i))
        # if an instance of x is found in string array, it will be appended into designated list
        if x in result:
            result[x].append(i)
        else:
            result[x] = [i]

    # return all values in list form
    return list(result.values())


class Solution:

# call on function
ob1 = Solution()

# display anagram
print(group_anagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
