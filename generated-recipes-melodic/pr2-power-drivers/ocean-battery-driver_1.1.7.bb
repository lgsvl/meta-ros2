# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This is an interface to the Ocean Server Technology Intelligent Battery and Power System."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Tully Foote"
HOMEPAGE = "http://www.ros.org/wiki/ocean_battery_driver"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_power_drivers"
ROS_BPN = "ocean_battery_driver"

ROS_BUILD_DEPENDS = " \
    diagnostic-msgs \
    diagnostic-updater \
    log4cxx \
    pr2-msgs \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-msgs \
    diagnostic-updater \
    log4cxx \
    pr2-msgs \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    diagnostic-updater \
    log4cxx \
    pr2-msgs \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_power_drivers-release/archive/release/melodic/ocean_battery_driver/1.1.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "de55532c0e6cfd409b81e759291c2188"
SRC_URI[sha256sum] = "4a494470bf4da45f24517df66b0c0fea70f79e15c14e6935e00f990d4e23b084"
S = "${WORKDIR}/pr2_power_drivers-release-release-melodic-ocean_battery_driver-1.1.7-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('pr2-power-drivers', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('pr2-power-drivers', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-power-drivers/pr2-power-drivers_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-power-drivers/pr2-power-drivers-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-power-drivers/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-power-drivers/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}