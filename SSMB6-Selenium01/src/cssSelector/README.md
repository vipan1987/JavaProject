1. Css selector does not change browser to browser like Xpath does.
2. Css is native to browser
3. identify css with
	3.1 tag --> div
	3.2 id --> #earth23
	3.3 class --> .highlited-3 
	3.4 attribute --> tag[attribute='Value'] -->> div[id='earth23']
	3.5 Contains --> tag[attribute*='Value'] -->> div[class*='earth_planet_']
	3.6 Starts-with --> tag[attribute^='Value'] -->> div[class^='earth_']
	3.7 Ends-with --> tag[attribute$='Value'] -->> div[class$='_home']
	3.8 Using Siblings
		3.8.1 nth-child()
		3.8.2 nth-last-child()
		3.8.3 nth-first-child()
		3.8.4 nth-of-type()
		3.8.4 first-of-type
		3.8.5 last of-type