class Solution {
public int titleToNumber(String c) {
int count=0;
for(int i=0;i<c.length();i++)
{
count*=26;
count+=(c.charAt(i)-'A'+1);
}
return count;
}
}