.class public Lcom/daaw/hc1$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/hc1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/daaw/hc1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/hc1;

    invoke-direct {v0}, Lcom/daaw/hc1;-><init>()V

    sput-object v0, Lcom/daaw/hc1$a;->a:Lcom/daaw/hc1;

    return-void
.end method
