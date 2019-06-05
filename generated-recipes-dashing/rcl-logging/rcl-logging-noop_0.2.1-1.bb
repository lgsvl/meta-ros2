# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "An rcl logger implementation that doesn't do anything with log messages."
AUTHOR = "Amazon B9 <amazon-b9-ros@amazon.com>"
ROS_AUTHOR = "Nick Burek <amazon-b9-ros@amazon.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rcl_logging"
ROS_BPN = "rcl_logging_noop"

ROS_BUILD_DEPENDS = " \
    rcutils \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
    python3-empy-native \
"

ROS_EXPORT_DEPENDS = " \
    rcutils \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rcutils \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    launch-testing \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rcl_logging-release/archive/release/dashing/rcl_logging_noop/0.2.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "555080ce1ec43eae467e642185773a70"
SRC_URI[sha256sum] = "f8e60d4a2316ff2bc5c069640520578895c1c16339be9fd8202efd85651835e6"
S = "${WORKDIR}/rcl_logging-release-release-dashing-rcl_logging_noop-0.2.1-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rcl-logging', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rcl-logging', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rcl-logging/rcl-logging_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rcl-logging/rcl-logging-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rcl-logging/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rcl-logging/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}