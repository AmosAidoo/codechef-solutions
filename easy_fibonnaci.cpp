#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(){
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int t;
	cin >> t;
	ll a[60];
	a[0] = 0;
	a[1] = 1;
	for (int i = 2; i < 60; i++) a[i] = a[i-1] + a[i-2];
	while (t--) {
		ll n;
		cin >> n;
		ll e = 1;
		while (e*2 <= n) e*=2;
		e--;
		cout << (a[e%60])%10 << "\n";
	}
}
