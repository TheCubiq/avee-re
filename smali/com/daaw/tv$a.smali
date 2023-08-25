.class public Lcom/daaw/tv$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/tv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static a:I = 0x1


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a()I
    .locals 2

    sget v0, Lcom/daaw/tv$a;->a:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/daaw/tv$a;->a:I

    return v0
.end method
