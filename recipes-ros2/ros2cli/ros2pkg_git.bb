SUMMARY = "The pkg command for ROS 2 command line tools."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

include ros2cli.inc

inherit setuptools3

DEPENDS = "ros2cli"

RDEPENDS_${PN} += "ament-index-python python3-catkin-pkg python3-empy python3-setuptools python3-unixadmin"
