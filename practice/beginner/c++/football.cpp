#include <bits/stdc++.h>
using namespace std;

int main(){
	ios::sync_with_stdio(0);
	cin.tie(0);
	int t;
	cin >> t;
	while(t--) {
		int n;
		cin >> n;
		int a[n], b[n];
		for (int i = 0; i < n; i++) cin >> a[i];
		for (int i = 0; i < n; i++) cin >> b[i];
		int best = -1e9;
		for (int i = 0; i < n; i++)
			best = max(best, (a[i]*20)-(b[i]*10));
		cout << (best < 0 ? 0 : best) << "\n";
	}
}
