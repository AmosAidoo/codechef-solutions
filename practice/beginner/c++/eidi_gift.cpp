#include <bits/stdc++.h>
using namespace std;

int main(){
	ios::sync_with_stdio(0);
	cin.tie(0);
	int t;
	cin >> t;

	while(t--) {
		int a[4]{0}, c[4];
		vector<pair<int, int>> ac;
		for (int i = 1; i <= 3; i++) {
			cin >> a[i];
		}
		for (int i = 1; i <= 3; i++) {
			cin >> c[i];
		}

		for (int i = 1; i <= 3; i++) {
			ac.push_back(make_pair(a[i], c[i]));
		}

		sort(ac.begin(), ac.end());
		bool nf = false;

		for (int i = 0; i < 3; i++) {
			if (ac[i].first < ac[i+1].first) {
				if (ac[i].second == ac[i+1].second) {
					nf = true;
					break;
				} else if (ac[i].second > ac[i+1].second) {
					nf = true;
					break;
				}
			} else if (ac[i].first == ac[i+1].first) {
				if (ac[i].second != ac[i+1].second) {
					nf = true;
					break;
				}
			}
		}

		if (nf) cout << "NOT FAIR\n";
		else cout << "FAIR\n";
	}
}
