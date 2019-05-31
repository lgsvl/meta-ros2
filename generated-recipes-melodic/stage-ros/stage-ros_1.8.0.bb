# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This package provides ROS specific hooks for stage"
AUTHOR = "William Woodall <william@osrfoundation.org>"
ROS_AUTHOR = "Brian Gerky <gerky@osrfoundation.org>"
HOMEPAGE = "http://ros.org/wiki/stage_ros"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "stage_ros"
ROS_BPN = "stage_ros"

ROS_BUILD_DEPENDS = " \
    boost \
    geometry-msgs \
    nav-msgs \
    roscpp \
    rostest \
    sensor-msgs \
    stage \
    std-msgs \
    std-srvs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    geometry-msgs \
    nav-msgs \
    roscpp \
    sensor-msgs \
    stage \
    std-msgs \
    std-srvs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    geometry-msgs \
    nav-msgs \
    roscpp \
    sensor-msgs \
    stage \
    std-msgs \
    std-srvs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/stage_ros-release/archive/release/melodic/stage_ros/1.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2cca864078011b5bf1968e771850e368"
SRC_URI[sha256sum] = "5762c477b0401c12f43573895f7a94ec3bdfddc4aa9fe3a127d3acc1ce2960d8"
S = "${WORKDIR}/stage_ros-release-release-melodic-stage_ros-1.8.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('stage-ros', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('stage-ros', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/stage-ros/stage-ros_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/stage-ros/stage-ros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/stage-ros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/stage-ros/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}