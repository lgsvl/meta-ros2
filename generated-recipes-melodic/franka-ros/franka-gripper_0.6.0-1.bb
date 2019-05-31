# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This package implements the franka gripper of type Franka Hand for the use in ros"
AUTHOR = "Franka Emika GmbH <support@franka.de>"
ROS_AUTHOR = "Franka Emika GmbH"
HOMEPAGE = "http://wiki.ros.org/franka_gripper"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "franka_ros"
ROS_BPN = "franka_gripper"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    control-msgs \
    libfranka \
    message-generation \
    roscpp \
    sensor-msgs \
    xmlrpcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    control-msgs \
    libfranka \
    message-generation \
    message-runtime \
    roscpp \
    sensor-msgs \
    xmlrpcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    control-msgs \
    libfranka \
    message-generation \
    message-runtime \
    roscpp \
    sensor-msgs \
    xmlrpcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/frankaemika/franka_ros-release/archive/release/melodic/franka_gripper/0.6.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "660503aebe9b435a7c6bca89c08892ad"
SRC_URI[sha256sum] = "ffa8aa860f953517851d9db0e6d0bdf5e87f26cf6d6a017fc5c13d10cff9b448"
S = "${WORKDIR}/franka_ros-release-release-melodic-franka_gripper-0.6.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('franka-ros', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('franka-ros', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/franka-ros/franka-ros_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/franka-ros/franka-ros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/franka-ros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/franka-ros/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}