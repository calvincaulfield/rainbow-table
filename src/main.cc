#include <iostream>
#include <string>

#include "md5.h"
#include "rainbow_table.h"
#include "rainbow_table_test.h"

std::string get_abs_path(std::string rel_path)
{
	return "/home/ubuntu/dev/calvincaulfield/rainbow-table/data/" + rel_path;
}

int main()
{
	using namespace hacking__rainbow_table;
	//hashStringTest();
	//getFirstAndLastTest();
	//getChainTest();

	// Pre-hacking operations
	// getFirstAndLast(get_abs_path("password/password_10k.txt"),
	// 				get_abs_path("test/first_last_10k.txt"), CHAIN_LENGHTH);


	// Hacking-time operations

	// Assume I stole some hashes of real users
	// hash(get_abs_path("password/password_10k.txt"), get_abs_path("test/hash.txt"));

	// Generate chain
	// getChain(get_abs_path("test/hash.txt"), get_abs_path("test/chain.txt"), CHAIN_LENGHTH);

	// Query DB needed here:
	//< Find all hashes in chain.txt which matches column 'last' of first-last table to get first.txt >

	// Get plaintext password
	getCrackedPassword(get_abs_path("test/first.txt"),
					   get_abs_path("test/cracked_password.txt"), CHAIN_LENGHTH);
}