#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
	int t;
	cin >> t;
	while(t--) {
	    int n,m,k,l,r;
	    cin >> n >> m >> k >> l >> r;
	    int best = 1e9;
	    for (int i = 1; i <= n; i++) {
	        int c,p;
	        cin >> c >> p;
	        for (int j = 1; j <= m; j++) {
	            if (c > k+1) --c;
	            else if (c < k-1) ++c;
	            else if (c >= (k-1) && c <= (k+1)) c = k;
	        }
	        if (c >= l && c <= r) {
	            best = min(best, p);
	        }
	    }
	    if (best == 1e9) cout << -1 << "\n";
	    else cout << best << "\n";
	}
}
