cmake_minimum_required (VERSION 2.6)

set(CMAKE_CXX_STANDARD 11)

if(NOT CMAKE_BUILD_TYPE)
  set(CMAKE_BUILD_TYPE Release)
endif()

message(STATUS "Build type: ${CMAKE_BUILD_TYPE}")
message(STATUS "C++ Standard: ${CMAKE_CXX_STANDARD}")


set(CMAKE_CXX_FLAGS "")
set(CMAKE_CXX_FLAGS_DEBUG "-g -Wall -Wextra")
set(CMAKE_CXX_FLAGS_RELEASE "-O3")

project (RainbowTable)

add_library (Lib lib)
add_library (Md5 md5)
add_library (RainbowTableTest rainbow_table_test)
add_library (RainbowTable rainbow_table)

add_executable (Main main)

target_link_libraries (Main RainbowTableTest RainbowTable Md5 Lib)


add_definitions(-Wfatal-errors)