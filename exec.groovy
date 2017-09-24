
class groovy1{
	static void main (String[] args) {

	def name = "Rajiv";
	println ('I am a ${name}\n');
	println ("I am a ${name}\n");
	def repeatStr = "What I Said is " * 2;

println ("2nd and 3rd index of the Name is " + name[3]);
println ("index of the letter r is " + name.indexOf('R'));
println ("first 3 characters of the name " + name[0..2]);
println ("Substring at 1 " + name.substring(1,4));
println ("my name is " + name);
println ("my name is ".concat(name));
println ("Derek == Derek " + ('Derek'.equals('Derek')));
println ("Derek == derek " + ('Derek'.equalsIgnoreCase('derek')));
println (repeatStr - "What");
println (repeatStr.split(' '));
println (repeatStr.toList());
println (repeatStr.replaceAll('I', 'she'));
println ("Uppercase " + name.toUpperCase());
println ("Lowercase " + name.toLowerCase());

def randString = "Random";
	} 
	}
