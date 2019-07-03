#include <bits/stdc++.h>
using namespace std;

int main(){
	int t;
	cin >> t;

	while (t--){
		int p;
		cin >> p;
		int power = log2(p);
		int ans = 0;

		if (p <= 2048){
			for (int i = 0; i <= power; i++){
				if (p & 1 << i) ans++;
			}
		} else {
			int i,x;
			i = x = 2048;
			ans++;
			while (true){
				if (i + x <= p){
					i += x;
					ans++;
					if (i == p) break;
					continue;
				} else if (i + x > p) {
					x >>= 1;
					continue;
				}
				break;
			}
		}
		cout << ans << "\n";
	}	
}