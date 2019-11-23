package rainbow_table
import db._
import util.TextViewer

object Main {
	def main(args: Array[String]): Unit = {
		//manageFile()
		hackingTest()
		//hackingReal()
	}

	def manageFile(): Unit = {
		//new TextFileCopier(getPath("/utf8.txt"), 
		//		getPath("/password_under_20digit.txt")).copyOnlyAscii(100000000, 20)	

	}

	def dataTest(): Unit = {
		//new Viewer().showLastLines(getPath("/password_under_20digit_first_last.txt"), 100)
		//new Viewer().getNumLines(getPath("/password_under_20digit.txt"))
		//new Viewer().getNumLines(getPath("/password_under_20digit_first_last.txt"))
		new TextViewer().showLines(getPath("/password_under_20digit.txt"), 10000, 100)
	}

	def getPath(path: String): String = {
		/*
		println("getPath " + path)
		val resource = getClass.getResource(path)
		println("getPath 2" + resource.getPath)
		return resource.getPath
		*/
		return "/home/ubuntu/dev/calvincaulfield/rainbow-table/data/" + path
	}

	def hackingTest(): Unit = {
		/** Pre-hacking operations **/

		// Store password sets (not mendatory)
		// new Loader(getPath("password/password_10k.txt"),
		// 	new MysqlConnection("rainbow_table").connection, "rainbow_table.password_10k").loadPassword

		// < Cpp program works here. (sample passward => first_last file) >

		// Store first_last data (mendatory)
		// new Loader(getPath("test/first_last_10k.txt"),
		// 	new MysqlConnection("rainbow_table").connection, "rainbow_table.first_lask_10k").loadFirstLast


		/** Hacking time operation **/
		new ChainLookup(getPath("test/chain.txt"), getPath("test/first.txt"),
			new MysqlConnection("rainbow_table").connection, "rainbow_table.first_lask_10k")

	}

}