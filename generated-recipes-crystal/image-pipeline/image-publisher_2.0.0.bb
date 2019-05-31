# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "<p>       Contains a node publish an image stream from single image file       or avi motion file.     </p>"
AUTHOR = "Vincent Rabaud <vincent.rabaud@gmail.com>"
ROS_AUTHOR = "Kei Okada"
HOMEPAGE = "http://ros.org/wiki/image_publisher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "image_pipeline"
ROS_BPN = "image_publisher"

ROS_BUILD_DEPENDS = " \
    camera-info-manager \
    class-loader \
    cv-bridge \
    image-transport \
    rclcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    camera-info-manager \
    class-loader \
    cv-bridge \
    image-transport \
    rclcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/image_pipeline-release/archive/release/crystal/image_publisher/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4034b7cd3946c7000eb94dfbe50c2d9b"
SRC_URI[sha256sum] = "399a70053d065f616ea3b8a4dcc0b8aa5aba278c3e12d60be4dadfffe39dc7eb"
S = "${WORKDIR}/image_pipeline-release-release-crystal-image_publisher-2.0.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('image-pipeline', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('image-pipeline', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/image-pipeline/image-pipeline_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/image-pipeline/image-pipeline-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/image-pipeline/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/image-pipeline/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}