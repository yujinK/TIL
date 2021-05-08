import collections

strs = ["eat","tea","tan","ate","nat","bat"]

anagrams = collections.defaultdict(list)
for str in strs:
    anagrams[''.join(sorted(str))].append(str)

print(list(anagrams.values()))