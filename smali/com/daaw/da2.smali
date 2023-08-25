.class public final Lcom/daaw/da2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/UUID;

.field public final b:[B


# direct methods
.method public constructor <init>(Ljava/util/UUID;I[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/da2;->a:Ljava/util/UUID;

    iput-object p3, p0, Lcom/daaw/da2;->b:[B

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/da2;)Ljava/util/UUID;
    .locals 0

    iget-object p0, p0, Lcom/daaw/da2;->a:Ljava/util/UUID;

    return-object p0
.end method
