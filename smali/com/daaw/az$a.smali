.class public final Lcom/daaw/az$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/az;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/daaw/az;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/az;

    invoke-direct {v0}, Lcom/daaw/az;-><init>()V

    sput-object v0, Lcom/daaw/az$a;->a:Lcom/daaw/az;

    return-void
.end method

.method public static synthetic a()Lcom/daaw/az;
    .locals 1

    sget-object v0, Lcom/daaw/az$a;->a:Lcom/daaw/az;

    return-object v0
.end method
