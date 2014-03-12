Okay, for this homework I was just a stupid bum and forgot to do it.
So when I redid this homework, I just rewrote it for comparables as well--may as well since the code's similar for Comparables and Strings/Integers.
Sooo the reason this homework was missing was all my fault.  No extraneous circumstances/excuses.

Second part of HW#4:
When searching, it's possible to instead start at the middle, and then move either to the upper half or lower half depending on relative relation
of the query and the pattern.  If you overshot the query with your guessed location, choose the previous half; otherwise, choose the next half
until there is only one choice left/the length is short enough to do a simple linear search.

Can be done either recursively or using a while loop.  Making a new array seems simpler, so recursively.  Base case: small search area, just linear search and return.  Otherwise: recursively call on the next simplification of the search space.