#
# @lc app=leetcode id=844 lang=python3
#
# [844] Backspace String Compare
#

# @lc code=start
class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        i = 0
        xs = list(s)
        while i < len(xs):
            if xs[i] == '#':
                xs.pop(i)
                if i > 0:
                    xs.pop(i - 1)
                    i -= 1
            else:
                i += 1

        i = 0
        xt = list(t)
        while i < len(xt):
            if xt[i]  == '#':
                xt.pop(i)
                if i > 0:
                    xt.pop(i - 1)
                    i -= 1
            else:
                i += 1

        return xs == xt
# @lc code=end
