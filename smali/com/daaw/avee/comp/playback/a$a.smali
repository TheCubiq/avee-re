.class public Lcom/daaw/avee/comp/playback/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ke0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/playback/a;->i(II[S)Lcom/daaw/ke0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:[S


# direct methods
.method public constructor <init>(I[S)V
    .locals 0

    iput p1, p0, Lcom/daaw/avee/comp/playback/a$a;->a:I

    iput-object p2, p0, Lcom/daaw/avee/comp/playback/a$a;->b:[S

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get(I)S
    .locals 1

    iget-object v0, p0, Lcom/daaw/avee/comp/playback/a$a;->b:[S

    aget-short p1, v0, p1

    return p1
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lcom/daaw/avee/comp/playback/a$a;->a:I

    return v0
.end method
