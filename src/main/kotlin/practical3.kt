fun main()
{
    print("Enrollment no:")
    val enroll= readLine()!!
    print("Name:")
    val name= readLine()!!.toString()
    print("Branch:")
    val branch= readLine()!!.toString()
    print("Batch:")
    val batch= readLine()!!.toString()
    print("College Name:")
    val college= readLine()!!.toString()
    print("University:")
    val university= readLine()!!.toString()
    print("Age:")
    val age= readLine()!!.toInt()
    println("***********")
    println("Student data: \nEnrollement no:$enroll \nName:$name \nBranch:$branch \nBatch:$batch \nCollege Name:$college \nUniversity:$university \nAge:$age")
}