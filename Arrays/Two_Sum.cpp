#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
    vector<int> twoSum(vector<int> &nums, int target)
    {
        int size = nums.size();
        map<int,int> hash;
        for (int i = 0; i < size; i++)
        {
            int cur = nums[i];
            int needed = abs(target - cur);
            if (hash.find(needed)!= hash.end())
            {
                return {hash[needed], i};
            }
            hash[cur] = i;
        }
        return {};
    }
};