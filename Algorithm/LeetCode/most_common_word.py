import collections, re
from typing import Collection

paragraph = "Bob. hIt, baLl"
banned = ["bob", "hit", "ball"]

words = [word for word in re.sub(r'[^\w]', ' ', paragraph).lower().split() if word not in banned]
counts = collections.Counter(words)
print(counts.most_common(1)[0][0])