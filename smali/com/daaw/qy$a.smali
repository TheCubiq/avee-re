.class public final Lcom/daaw/qy$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/qy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/daaw/qy;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/qy;

    invoke-direct {v0}, Lcom/daaw/qy;-><init>()V

    sput-object v0, Lcom/daaw/qy$a;->a:Lcom/daaw/qy;

    return-void
.end method

.method public static synthetic a()Lcom/daaw/qy;
    .locals 1

    sget-object v0, Lcom/daaw/qy$a;->a:Lcom/daaw/qy;

    return-object v0
.end method
