.class public final Lcom/daaw/fa2;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Lcom/daaw/fz6;

.field public static final c:Lcom/daaw/fz6;


# instance fields
.field public final a:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3a

    invoke-static {v0}, Lcom/daaw/by6;->b(C)Lcom/daaw/by6;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/fz6;->c(Lcom/daaw/by6;)Lcom/daaw/fz6;

    move-result-object v0

    sput-object v0, Lcom/daaw/fa2;->b:Lcom/daaw/fz6;

    const/16 v0, 0x2a

    invoke-static {v0}, Lcom/daaw/by6;->b(C)Lcom/daaw/by6;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/fz6;->c(Lcom/daaw/by6;)Lcom/daaw/fz6;

    move-result-object v0

    sput-object v0, Lcom/daaw/fa2;->c:Lcom/daaw/fz6;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/fa2;->a:Ljava/util/List;

    return-void
.end method
