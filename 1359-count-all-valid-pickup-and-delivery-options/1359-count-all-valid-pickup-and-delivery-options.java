/*

for n=1
    ans =1 bcuz (P1,D1)
    
for n=2
- we will try to add (P2,D2) to the existing pair (P1,D1)
- P2,D2 can come in these places together:__P1D1, P1__D1, P1D1__
- so now the ans = 3

now lets check for P2 and D2 seprately

- fix P2 before P1 (P2P1D1) and places where D2 can come are:P2P1_D1, P2P1D1_ P (total 2 places)
so ans = 3+2=5

- now fix P2 after P1 (P1P2D2) and places where D2 can come are: P1P2D1_ (total 1 place)
so ans = 3+2+1 = 6

- where we can observe ans is coming as sum of no. till 3

for n=3
- now we have 6 combination of prev numbers so lets pick one of them (P1P2D1D2) and try to add P3 and D3 to it

- no of ways to add P3 D3 together are: (__P1P2D1D2, P1__P2D1D2, P1P2__D1D2, P1P2D1__D2, P1P2D1__D2) = 5
so ans = 5

- now we can fix P3 before P1(P3P1P2D1D2) and check for no of ways D3 can come: P3P1_P2D1D2, P3P1P2_D1D2, P3P1P2D1_D2, P3P1P2D1D2_ = 4
so ans = 5+4

as seen from n=2 we can ans would be sum of no till 5 (5+4+3+2+1) = 25

Here we checked for one prev combination (P1P2D1D2). There were total 6 combinations so the ans would be =  6*(5+4+3+2+1) = 90


for n=4
we can conclude the ans would be = 90*(7+6+5+4+3+2+1) = 2520

*/



class Solution {
    public int countOrders(int n) {
        int mod = 1000000007;
        long ans = 1;
        int sn = 3;
        for(int i=2;i<=n;i++){
            int sum = (sn)*(sn+1)%mod/2;
            ans = (ans*sum)%mod;
            sn+=2;
        }
        return (int)ans%mod;
    }
}
