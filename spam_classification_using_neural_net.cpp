#include <bits/stdc++.h>
using namespace std;

int main(){
	ios::sync_with_stdio(0);
	cin.tie(0);
	typedef long long ll;
	int t;
	cin >> t;

	while (t--){
		int n;
		ll minX, maxX;
		cin >> n >> minX >> maxX;
		ll w, b;
		int nonSpammers = 0, spammers = 0;
		ll first = minX;
		ll second = first + 1;
		for (int i = 0; i < n; i++){
			cin >> w >> b;
			first = first * w + b;
			second = second * w + b;
		}
		int difference = second - first;
		ll y = first;
		for (ll x = minX; x <= maxX; x++){
			if (y % 2 == 0) nonSpammers++;
			else spammers++;
			y += difference;
		}
		cout << nonSpammers << " " << spammers << "\n";
	}
}
