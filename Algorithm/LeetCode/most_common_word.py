import collections, re
from typing import Collection

paragraph = "Bob. hIt, baLl"
banned = ["bob", "hit"]

counter = collections.Counter()
words = paragraph.lower()

input = ""
for word in words:
    if re.match('[^a-z]', word):
        if input.isalpha() and input not in banned:
            counter[input] += 1
        input = ""
    else:
        input += word

print(input) if len(counter) == 0 else print(counter.most_common(1)[0][0])