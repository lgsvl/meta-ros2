# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The wiimote package allows ROS nodes to communicate with a Nintendo Wiimote     and its related peripherals, including the Nunchuk, Motion Plus, and     (experimentally) the Classic. The package implements a ROS node that uses     Bluetooth to communicate with the Wiimote device, obtaining accelerometer     and gyro data, the state of LEDs, the IR camera, rumble (vibrator),     buttons, joystick, and battery state. The node additionally enables ROS     nodes to control the Wiimote's LEDs and vibration for feedback to the human     Wiimote operator. LEDs and vibration may be switched on and off, or made to     operate according to a timed pattern."
AUTHOR = "Jonathan Bohren <jbo@jhu.edu>"
ROS_AUTHOR = "Andreas Paepcke"
HOMEPAGE = "http://www.ros.org/wiki/wiimote"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

ROS_CN = "joystick_drivers"
ROS_BPN = "wiimote"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_cwiid-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-cwiid} \
    genmsg \
    geometry-msgs \
    python-numpy \
    roscpp \
    roslib \
    roslint \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-cwiid} \
    genmsg \
    geometry-msgs \
    python-numpy \
    roscpp \
    roslib \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_cwiid} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-cwiid} \
    genmsg \
    geometry-msgs \
    python-numpy \
    roscpp \
    roslib \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/joystick_drivers-release/archive/release/melodic/wiimote/1.13.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "110dc9ce6ee621eda47b72ad93a4e35f"
SRC_URI[sha256sum] = "75a5a30cf029917d650bf7b2bfaf50737e9397a461fd813d7182882a4ac12701"
S = "${WORKDIR}/joystick_drivers-release-release-melodic-wiimote-1.13.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('joystick-drivers', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('joystick-drivers', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/joystick-drivers/joystick-drivers_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/joystick-drivers/joystick-drivers-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/joystick-drivers/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/joystick-drivers/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}