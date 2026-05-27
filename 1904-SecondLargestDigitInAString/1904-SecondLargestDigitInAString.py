# Last updated: 5/27/2026, 12:31:41 PM
class Solution(object):
    def secondHighest(self, s):
        l=[]
        for i in s:
           if i.isnumeric():
                l.append(int(i))
        l=list(set(l))
        l.sort(reverse=True)        
        if len(l) < 2:
            return -1    
        else:
            return l[1]      

        