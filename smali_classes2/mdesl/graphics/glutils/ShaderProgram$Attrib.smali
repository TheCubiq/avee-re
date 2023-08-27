.class public Lmdesl/graphics/glutils/ShaderProgram$Attrib;
.super Ljava/lang/Object;
.source "ShaderProgram.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmdesl/graphics/glutils/ShaderProgram;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "Attrib"
.end annotation


# instance fields
.field location:I

.field name:Ljava/lang/String;


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 110
    iput-object v0, p0, Lmdesl/graphics/glutils/ShaderProgram$Attrib;->name:Ljava/lang/String;

    const/4 v0, -0x1

    .line 113
    iput v0, p0, Lmdesl/graphics/glutils/ShaderProgram$Attrib;->location:I

    return-void
.end method
