cmake_minimum_required(VERSION 3.6.0)

find_library(log-lib
        log)

add_library(
        update
        SHARED
        update.cpp)

target_link_libraries(update
        ${log-lib})
