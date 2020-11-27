Here i think i need to learn about cloning, and adpter design pattern, before continuing with this challenge, as i found a problem with the Warrior.engage(Warrior) method, specially when it comes to uniqueEffect(int round). The issue is that uniqueEffect is related to the round. 
	*To solutions are in mind 
		- the first one, is to make Warrior dependent of Round too, that means warrior's states will change according to the round ( uniqeEffects ). However, the issue here, is if some Warrior won the engage "fight", he will have low hit points for the next one. If that's undesirable, there is a second solution. 
		- the second one, is that we use an Adapter/Clone inside the engage(Combat) method [ that we should prbably aggregate to an other class ] and copy our two Warriors stats, so the changes will be local to the Warrior.engage(Warrior) method. 
{check if newLine works in vi} 
