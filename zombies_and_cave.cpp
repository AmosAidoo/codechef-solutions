#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int main(){
	int t;
	scanf("%d", &t);
	while(t--){
		int n;
		scanf("%d", &n);
		ll c[n]{0},h[n]{0};
		ll sumH = 0;
		ll sumR = 0;
		for (int i = 1; i <= n; i++) scanf("%lld",&c[i]);
		for (int i = 1; i <= n; i++) {
			scanf("%lld",&h[i]);
			sumH += h[i];
		}

		for (int i = 1; i <= n; i++) {
			ll start = i - c[i];
			start = start <= 0 ? 1 : start;
			ll end = i + c[i];
			end = end >= n ? n : end;
			for (int j = start; j <= end; j++) {
				sumR += 1;
			}
		}

		if (sumR == sumH) printf("YES\n");
		else printf("NO\n");
	}	
}
