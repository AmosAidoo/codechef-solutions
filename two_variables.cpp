#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(){
	ios::sync_with_stdio(0);
	cin.tie(0);
	int t;
	cin >> t;
	vector<ll> pws;
	ll y = 0L;	
	for (ll p = 0; p <= 1e9; p++){
		ll product = p * p;
		if (product > y){
			y += product;
			pws.push_back(p);
		}
	}
	while (t--){
		int xf;
		cin >> xf;
		
		ll ans = upper_bound(pws.begin(), pws.end(), xf) - pws.begin();
		cout << ans << "\n";
	}
}
