#include <bits/stdc++.h>
using namespace std;

int main(){
	int t;
	scanf("%d", &t);
	while (t--){
		long long n, k;
		scanf("%lld %lld", &n, &k);
		long long div = n / k;
		if (div % k == 0) printf("NO\n");
		else printf("YES\n");
	}
}
