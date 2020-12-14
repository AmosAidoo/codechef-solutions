#include <bits/stdc++.h>
using namespace std;

int main() {
	int t;
	cin >> t;

	while(t--){
		int D;
		string S;
		cin >> D >> S;
		int d_present = 0, by_proxy = 0;

		for (char c : S)
			if (c == 'P')
				d_present++;
		double attendance = 0;
		for (int i = 2; i < D - 2; i++){
			attendance = (double) d_present / (double) D;

			if (attendance >= 0.75)
				break;
			if (S[i] == 'A'){
				if ((S[i - 1] == 'P' || S[i - 2] == 'P') && (S[i + 1] == 'P' || S[i + 2] == 'P')){
					d_present++;
					by_proxy++;
				}
			}
		}
		attendance = (double) d_present / (double) D;
		if (attendance < 0.75)
			cout << -1 << "\n";
		else
			cout << by_proxy << "\n";
	}
}